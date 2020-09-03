package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.exit;

public class SudokuSolver {

    public static void main(String[] args) {
        SudokuSolver ss = new SudokuSolver();
        ss.sudokuSplitter();

    }

    public void sudokuSplitter() { // 3, , 4, 1, ...
        ArrayList<Cell> cells = new ArrayList<>(16);
        ArrayList<State> states = new ArrayList<>();
        ArrayList<Node> nodes = new ArrayList<>();
        List<Integer> oopsiesStates = new ArrayList<>();
        List<Integer> lastValue = new ArrayList<>();
        List<Integer> lastChangedCellPos = new ArrayList<>();
        List<Integer> decider = new ArrayList<>();
        int stateCounter = 0;
        int stateLevel = 1;

        boolean isBox = false;
        boolean isRow = false;
        boolean isCol = false;
        boolean isIndv = false;
        boolean cond = true;

        long sTime = System.nanoTime();
        long eTime = 0;

        nodes.add(stateCounter, new Node(new State().start(), null, 0));
        System.out.println(nodes.get(0).getState());
        int cantAdd = 0;
        boolean oopsie = false;
        int svc = 0;
        int[][] dontAdd = new int[300][9];
        int dontAddCounter = 0;

        if (nodes.get(0).getState().getCells().size() == 16) {
            /*while(cond) {
                int[] bCells = new int[4];
                int j = 0;


                List<Integer> singleValues = posValue(nodes.get(stateCounter).getState());
                if(singleValues.size() != 0)
                    isIndv = true;
                else{
                    isIndv = false;
                    isBox = true;
                }



                if (isBox && !isIndv){
                    bCells = posOfCellsBox(nodes.get(stateCounter).getState());
                    //System.out.println(bCells[0] + " " + bCells[1]  + " " +  bCells[2]  + " " +  bCells[3]);
                } else if (isRow && !isIndv)
                    bCells = posOfCellsRow(nodes.get(stateCounter).getState());
                else if (isCol && !isIndv)
                    bCells = posOfCellsCol(nodes.get(stateCounter).getState());


                //System.out.println("box: " + findCrowdedBox(nodes.get(stateCounter).getState()));
                if(!oopsie) {
                    for (int i = 0; i < 4; i++) {
                        if(!isIndv) {
                            if (nodes.get(stateCounter).getState().getCells().get(bCells[i]).getValue() == 0) {
                                for (j = 1; j <= 4; j++) {
                                    //System.out.println(j+"i: " + i + " s: " + stateCounter + " p: "  + bCells[i] + " v: "  + nodes.get(stateCounter).getState().getCells().get(bCells[i]).getValue());

                                    if (isLegal(nodes.get(stateCounter).getState(), nodes.get(stateCounter).getState().getCells().get(bCells[i]), j)) {
                                        //System.out.println("Putting " + j + " in " + bCells[i]);
                                        stateCounter++;

                                        List<Cell> newCellList = State.prevStateCells(nodes.get(stateCounter - 1).getState().getCells());
                                        nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(stateCounter - 1))); //made new node, parent is prev node
                                        nodes.get(stateCounter).getState().getCells().get(bCells[i]).setValue(j); //sets the value of the cell in the new node/state
                                        System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());
                                        lastValue = j;
                                        lastChangedCellPos = bCells[i];
                                        cantAdd = 0;
                                        break;
                                    } else if (cantAdd == 4) {
                                        oopsie = true;
                                        cantAdd = 0;
                                        break;
                                    } else
                                        cantAdd++;
                                }
                            }
                        } else {
                            stateCounter++;
                            List<Cell> newCellList = State.prevStateCells(nodes.get(stateCounter - 1).getState().getCells());
                            if (nodes.get(stateCounter - 1) != null)
                                nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(stateCounter - 1))); //made new node, parent is prev node
                            else
                                nodes.add(stateCounter, new Node(new State(newCellList), null)); //made new node, parent is prev node

                            int pos;
                            if(svc % 2 == 0)
                                pos = svc;
                            else
                                pos = ++svc;

                            int val = ++svc;

                            if(singleValues.size() <= pos){
                                svc = 0;
                                break;
                            }
                            //System.out.println("pos: " + pos + " val: " + val);
                            nodes.get(stateCounter).getState().getCells().get(singleValues.get(pos)).setValue(singleValues.get(val)); //sets the value of the cell in the new node/state
                            System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());

                        }
                    }
                }
                else {
                    //System.out.println("Made oopsie!");
                    System.out.println("Backtracking now!");
                    nodes.remove(stateCounter);
                    --stateCounter;
                    if(nodes.get(stateCounter).getState().getCells().get(lastChangedCellPos).getValue() == 0) {
                        if (isLegal(nodes.get(stateCounter).getState(), nodes.get(stateCounter).getState().getCells().get(lastChangedCellPos), ++lastValue)) {
                            stateCounter++;

                            List<Cell> newCellList = State.prevStateCells(nodes.get(stateCounter - 1).getState().getCells());
                            if (nodes.get(stateCounter - 1) != null)
                                nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(stateCounter - 1))); //made new node, parent is prev node
                            else
                                nodes.add(stateCounter, new Node(new State(newCellList), null)); //made new node, parent is prev node

                            nodes.get(stateCounter).getState().getCells().get(lastChangedCellPos).setValue(lastValue); //sets the value of the cell in the new node/state
                            System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());
                            oopsie = false;
                        }
                    }
                }

                if(State.isFull(nodes.get(stateCounter).getState())) cond = false;
            }*/
        } else if (nodes.get(0).getState().getCells().size() == 36) {
            /*while (cond) {
                int[] bCells = new int[6];
                int j = 0;


                List<Integer> singleValues = posValue(nodes.get(stateCounter).getState());
                if (singleValues.size() != 0)
                    isIndv = true;
                else {
                    isIndv = false;
                    isBox = true;
                }


                if (isBox && !isIndv) {
                    bCells = posOfCellsBox(nodes.get(stateCounter).getState());
                    //System.out.println(bCells[0] + " " + bCells[1]  + " " +  bCells[2]  + " " +  bCells[3]);
                } else if (isRow && !isIndv)
                    bCells = posOfCellsRow(nodes.get(stateCounter).getState());
                else if (isCol && !isIndv)
                    bCells = posOfCellsCol(nodes.get(stateCounter).getState());


                //System.out.println("box: " + findCrowdedBox(nodes.get(stateCounter).getState()));
                if (!oopsie) {
                    for (int i = 0; i < 6; i++) {
                        if (!isIndv) {
                            if (nodes.get(stateCounter).getState().getCells().get(bCells[i]).getValue() == 0) {
                                for (j = 1; j <= 6; j++) {
                                    //System.out.println(j+"i: " + i + " s: " + stateCounter + " p: "  + bCells[i] + " v: "  + nodes.get(stateCounter).getState().getCells().get(bCells[i]).getValue());

                                    if (isLegal(nodes.get(stateCounter).getState(), nodes.get(stateCounter).getState().getCells().get(bCells[i]), j)) {
                                        //System.out.println("Putting " + j + " in " + bCells[i]);
                                        stateCounter++;

                                        List<Cell> newCellList = State.prevStateCells(nodes.get(stateCounter - 1).getState().getCells());
                                        nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(stateCounter - 1))); //made new node, parent is prev node
                                        nodes.get(stateCounter).getState().getCells().get(bCells[i]).setValue(j); //sets the value of the cell in the new node/state
                                        System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());
                                        lastValue = j;
                                        lastChangedCellPos = bCells[i];
                                        cantAdd = 0;
                                        break;
                                    } else if (cantAdd == 6) {
                                        oopsie = true;
                                        cantAdd = 0;
                                        break;
                                    } else
                                        cantAdd++;
                                }
                            }
                        } else {
                            stateCounter++;
                            List<Cell> newCellList = State.prevStateCells(nodes.get(stateCounter - 1).getState().getCells());
                            if (nodes.get(stateCounter - 1) != null)
                                nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(stateCounter - 1))); //made new node, parent is prev node
                            else
                                nodes.add(stateCounter, new Node(new State(newCellList), null)); //made new node, parent is prev node

                            int pos;
                            if (svc % 2 == 0)
                                pos = svc;
                            else
                                pos = ++svc;

                            int val = ++svc;

                            if (singleValues.size() <= pos) {
                                svc = 0;
                                break;
                            }
                            //System.out.println("pos: " + pos + " val: " + val);
                            nodes.get(stateCounter).getState().getCells().get(singleValues.get(pos)).setValue(singleValues.get(val)); //sets the value of the cell in the new node/state
                            System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());

                        }
                    }
                } else {
                    //System.out.println("Made oopsie!");
                    System.out.println("Backtracking now!");
                    nodes.remove(stateCounter);
                    --stateCounter;
                    if (nodes.get(stateCounter).getState().getCells().get(lastChangedCellPos).getValue() == 0) {
                        if (isLegal(nodes.get(stateCounter).getState(), nodes.get(stateCounter).getState().getCells().get(lastChangedCellPos), ++lastValue)) {
                            stateCounter++;

                            List<Cell> newCellList = State.prevStateCells(nodes.get(stateCounter - 1).getState().getCells());
                            if (nodes.get(stateCounter - 1) != null)
                                nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(stateCounter - 1))); //made new node, parent is prev node
                            else
                                nodes.add(stateCounter, new Node(new State(newCellList), null)); //made new node, parent is prev node

                            nodes.get(stateCounter).getState().getCells().get(lastChangedCellPos).setValue(lastValue); //sets the value of the cell in the new node/state
                            System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());
                            oopsie = false;
                        }
                    }
                }

                if (State.isFull(nodes.get(stateCounter).getState())) cond = false;
            }*/
        }

        /*while (!State.isFull(nodes.get(stateCounter).getState())) {
            int[] bCells = new int[9];
            int j = 0;


            List<Integer> singleValues = posValue(nodes.get(stateCounter).getState());
            if (singleValues.size() != 0) {
                isIndv = true;
                isBox = false;
            } else {
                isIndv = false;
                isBox = true;
            }


            if (isBox && !isIndv) {
                bCells = posOfCellsBox(nodes.get(stateCounter).getState());
                //System.out.println(bCells[0] + " " + bCells[1]  + " " +  bCells[2]  + " " +  bCells[3]);
            } else if (isRow && !isIndv)
                bCells = posOfCellsRow(nodes.get(stateCounter).getState());
            else if (isCol && !isIndv)
                bCells = posOfCellsCol(nodes.get(stateCounter).getState());


            if (!oopsie) {
                for (int i = 0; i < 9; i++) {
                    if (!isIndv) {
                        System.out.println("We in boxes!");
                        System.out.println("state: " + stateCounter);
                        System.out.println("box: " + findCrowdedBox(nodes.get(stateCounter).getState()));
                        int counte = 0;

                        if (nodes.get(stateCounter).getState().getCells().get(bCells[i]).getValue() == 0) {
                            for (j = 1; j <= 9; j++) {
                                //System.out.println(j+"i: " + i + " s: " + stateCounter + " p: "  + bCells[i] + " v: "  + nodes.get(stateCounter).getState().getCells().get(bCells[i]).getValue());

                                if (isLegal(nodes.get(stateCounter).getState(), nodes.get(stateCounter).getState().getCells().get(bCells[i]), j)) {
                                    //System.out.println("Putting " + j + " in " + bCells[i]);
                                    stateCounter++;
                                    decider.add(0);

                                    List<Cell> newCellList = State.prevStateCells(nodes.get(stateCounter - 1).getState().getCells());
                                    nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(stateCounter - 1))); //made new node, parent is prev node
                                    nodes.get(stateCounter).getState().getCells().get(bCells[i]).setValue(j); //sets the value of the cell in the new node/state
                                    System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());
                                    //if (decider.get(decider.size() - 2) == 1) {
                                    lastValue.add(j);
                                    lastChangedCellPos.add(bCells[i]);
                                    oopsiesStates.add(stateCounter);
                                    //}
                                    /*for (Cell cell : nodes.get(stateCounter).getState().getCells()) {
                                        if (cell.getPredictAmt() == 0) {
                                            oopsie = true;
                                            break;
                                        }
                                    }
                                    break;
                                } else if (cantAdd == 9) {
                                    cantAdd = 0;
                                    oopsie = true;
                                } else {
                                    cantAdd++;
                                }
                            }
                        }
                    } else {
                        stateCounter++;
                        System.out.println("Indv part!");
                        decider.add(1);

                        List<Cell> newCellList = State.prevStateCells(nodes.get(stateCounter - 1).getState().getCells());
                        if (nodes.get(stateCounter - 1) != null)
                            nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(stateCounter - 1))); //made new node, parent is prev node
                        else
                            nodes.add(stateCounter, new Node(new State(newCellList), null)); //made new node, parent is prev node

                        int pos;
                        if (svc % 2 == 0)
                            pos = svc;
                        else
                            pos = ++svc;

                        int val = ++svc;

                        if (singleValues.size() <= pos) {
                            svc = 0;
                            break;
                        }
                        //System.out.println("pos: " + pos + " val: " + val);
                        if (isLegal(nodes.get(stateCounter).getState(), nodes.get(stateCounter).getState().getCells().get(singleValues.get(pos)), singleValues.get(val))) {
                            nodes.get(stateCounter).getState().getCells().get(singleValues.get(pos)).setValue(singleValues.get(val)); //sets the value of the cell in the new node/state
                            System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());
                        }
                    }
                }
            } else {
                //System.out.println("Made oopsie!");
                System.out.println("Backtracking now!");
                boolean cond2 = true;
                //while (cond2) {
                int lastState = 0;
                int lP = 0;
                int lV = 0;
                if (oopsiesStates.size() == 0 || lastValue.size() == 0 || lastChangedCellPos.size() == 0) {
                    cond2 = false;
                    oopsie = false;

                } else {
                    lastState = oopsiesStates.remove(oopsiesStates.size() - 1);
                    lV = lastValue.remove(lastValue.size() - 1);
                    lP = lastChangedCellPos.remove(lastChangedCellPos.size() - 1);
                    //System.out.println("Changing state " + lastState + " and remove val: " + lV + " on pos: " + lP);
                }

                if (nodes.get(lastState).getState().getCells().get(lP).getValue() == 0) {
                    for (int p = 1; p <= 9 && p != lV; p++) {
                        if (isLegal(nodes.get(lastState).getState(), nodes.get(lastState).getState().getCells().get(lP), p)) {
                            stateCounter++;

                            List<Cell> newCellList = State.prevStateCells(nodes.get(lastState).getState().getCells());
                            if (nodes.get(stateCounter - 1) != null)
                                nodes.add(stateCounter, new Node(new State(newCellList), nodes.get(lastState))); //made new node, parent is prev node
                            else
                                nodes.add(stateCounter, new Node(new State(newCellList), null)); //made new node, parent is prev node

                            nodes.get(stateCounter).getState().getCells().get(lP).setValue(p); //sets the value of the cell in the new node/state
                            System.out.println("{" + stateCounter + "} " + nodes.get(stateCounter).getState());
                            oopsie = false;
                            break;
                        }
                    }
                }
                //}
            }

            if (State.isFull(nodes.get(stateCounter).getState())) {
                cond = false;
                eTime = System.nanoTime();
            }
        }*/
        //while(!State.isFull(nodes.get(stateCounter).getState())) {
        /*for (Cell cell : nodes.get(stateCounter).getState().getCells()) {
            if (cell.getValue() == 0) {
                cantAdd = 0;
                for (int i = 1; i <= 9; i++) {
                    if (isLegal(nodes.get(stateCounter).getState(), cell, i)) {
                        int newState = ++stateCounter;
                        int oldState = stateCounter - 1;

                        List<Cell> newList = State.prevStateCells(nodes.get(oldState).getState().getCells());

                        nodes.add(newState, new Node(new State(newList), nodes.get(oldState), stateLevel));
                        nodes.get(newState).getState().getCells().get(cell.getPos()).setValue(i);
                        System.out.println("{" + newState + "|" + stateLevel + "} " + nodes.get(newState).getState());
                        dontAdd[newState][dontAddCounter] = i;
                        lastValue.add(i);
                        lastChangedCellPos.add(cell.getPos());
                        break;
                    } else if (cantAdd == 9) {
                        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    } else {
                        cantAdd++;
                    }
                }
                if (cantAdd != 9) stateLevel++;
            }
        }*/
        //}

        Node parent = nodes.get(0);

            /*int cellPos = 0;
            int cellVal = 0;
            if (lastChangedCellPos.size() - 1 == 0 || lastValue.size() - 1 == 0)
                cond3 = false;
            else {
                cellPos = lastChangedCellPos.get(lastChangedCellPos.size() - 1);
                cellVal = lastValue.get(lastValue.size() - 1);
                lastChangedCellPos.remove(lastChangedCellPos.size() - 1);
                lastValue.remove(lastValue.size() - 1);
            }*/

        moreSolutions(nodes.get(0), nodes);

        //}



        /*for (Node node : nodes) {
            if (State.isFull(node.getState())) {
                System.out.println("WEEE");
                break;
            }
        }*/

        System.out.println(nodes.size());
        long timeSpent = eTime - sTime;
        System.out.println(timeSpent + " nano seconds!");


    }

    public int findCrowdedBox(State state) {
        int box = 1;
        int max = 9;

        for (int i = 1; i <= 9; i++) {
            int numOfZeroes = 0;

            char[] values = state.getValuesInBox(i).toCharArray();
            for (char value : values) {
                if (value == '0') numOfZeroes++;
            }
            if (numOfZeroes < max && numOfZeroes != 0) {
                box = i;
                max = numOfZeroes;
            }

        }
        return box;
    }

    public int findCrowdedRow(State state) {
        int row = 1;
        int max = 9;

        for (int i = 1; i <= 9; i++) {
            int numOfZeroes = 0;

            char[] values = state.getValuesInRow(i).toCharArray();
            for (char value : values) {
                if (value == '0') numOfZeroes++;
            }
            if (numOfZeroes < max && numOfZeroes != 0) {
                row = i;
                max = numOfZeroes;
            }
        }
        return row;
    }

    public int findCrowdedCol(State state) {
        int col = 1;
        int max = 9;

        for (int i = 1; i <= 9; i++) {
            int numOfZeroes = 0;

            char[] values = state.getValuesInCol(i).toCharArray();
            for (char value : values) {
                if (value == '0') numOfZeroes++;
            }
            if (numOfZeroes < max && numOfZeroes != 0) {
                col = i;
                max = numOfZeroes;
            }
        }
        return col;
    }

    /*public Integer[] findPosOfEmpty(State state){
        ArrayList<Integer> pos = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < 16; i++){
            if(state.cells.get(i).getValue() == 0) pos.add(i);
        }

        return pos.toArray(new Integer[0]);
    }

    public int cellWithMostAdj(State state){
        int cellPos = 0;
        Integer[] arr = findPosOfEmpty(state);




        return cellPos;
    }*/
    /*public void function(State state){
        int box = findCrowdedBox(state);
        int row = findCrowdedRow(state);
        int col = findCrowdedCol(state);

        //Maybe find a common object/cell
    }*/

    public int[] posOfCellsBox(State state) {
        int boxChoice = findCrowdedBox(state);
        int c1 = 0;
        switch (boxChoice) {
            case 1:
                c1 = 0;
                break;
            case 2:
                c1 = 3;
                break;
            case 3:
                c1 = 6;
                break;
            case 4:
                c1 = 27;
                break;
            case 5:
                c1 = 30;
                break;
            case 6:
                c1 = 33;
                break;
            case 7:
                c1 = 54;
                break;
            case 8:
                c1 = 57;
                break;
            case 9:
                c1 = 60;
                break;
        }

        int c2 = c1 + 1;
        int c3 = c2 + 1;
        int c4 = c1 + 9;
        int c5 = c2 + 9;
        int c6 = c3 + 9;
        int c7 = c4 + 9;
        int c8 = c5 + 9;
        int c9 = c6 + 9;

        return new int[]{c1, c2, c3, c4, c5, c6, c7, c8, c9};
    }

    public int[] posOfCellsRow(State state) {
        int rowChoice = findCrowdedRow(state);
        int c1 = 0;
        switch (rowChoice) {
            case 1:
                c1 = 0;
                break;
            case 2:
                c1 = 9;
                break;
            case 3:
                c1 = 18;
                break;
            case 4:
                c1 = 27;
                break;
            case 5:
                c1 = 36;
                break;
            case 6:
                c1 = 45;
                break;
            case 7:
                c1 = 54;
                break;
            case 8:
                c1 = 63;
                break;
            case 9:
                c1 = 72;
                break;
        }

        int c2 = c1 + 1;
        int c3 = c2 + 1;
        int c4 = c3 + 1;
        int c5 = c4 + 1;
        int c6 = c5 + 1;
        int c7 = c6 + 1;
        int c8 = c7 + 1;
        int c9 = c8 + 1;

        return new int[]{c1, c2, c3, c4, c5, c6, c7, c8, c9};
    }

    public int[] posOfCellsCol(State state) {
        int colChoice = findCrowdedCol(state);
        int c1 = 0;
        switch (colChoice) {
            case 1:
                c1 = 0;
                break;
            case 2:
                c1 = 1;
                break;
            case 3:
                c1 = 2;
                break;
            case 4:
                c1 = 3;
                break;
            case 5:
                c1 = 4;
                break;
            case 6:
                c1 = 5;
                break;
            case 7:
                c1 = 6;
                break;
            case 8:
                c1 = 7;
                break;
            case 9:
                c1 = 8;
                break;
        }

        int c2 = c1 + 6;
        int c3 = c2 + 6;
        int c4 = c3 + 6;
        int c5 = c4 + 6;
        int c6 = c5 + 6;

        return new int[]{c1, c2, c3, c4, c5, c6};
    }

    //Can make the functions shorter if possible ^

    public Boolean isLegal(State state, Cell cell, int newValue) {

        if (state.getCells().size() == 16) {
            if (newValue < 1 || newValue > 4)
                return false;
        } else if (state.getCells().size() == 36) {
            if (newValue < 1 || newValue > 6)
                return false;
        } else if (state.getCells().size() == 81) {
            if (newValue < 1 || newValue > 9)
                return false;
        }


        char[] ar1 = state.getValuesInBox(cell.getBox()).toCharArray();
        for (char value : ar1) {
            if (Character.getNumericValue(value) == newValue) return false;
        }

        char[] ar2 = state.getValuesInCol(cell.getCol()).toCharArray();
        for (char value : ar2) {
            if (Character.getNumericValue(value) == newValue) return false;
        }

        char[] ar3 = state.getValuesInRow(cell.getRow()).toCharArray();

        for (char value : ar3) {
            if (Character.getNumericValue(value) == newValue) return false;
        }

        return true;
    }

    public int[][] isPredict(State state) {
        int[][] result = new int[0][0];
        int[] temp;
        if (state.getCells().size() == 16)
            result = new int[16][4];
        else if (state.getCells().size() == 36)
            result = new int[36][6];
        else if (state.getCells().size() == 81)
            result = new int[81][9];


        int j = 0;
        int size = 0;
        if (state.getCells().size() == 16) {
            for (Cell cell : state.getCells()) {
                if (cell.getValue() == 0) {
                    temp = new int[4];
                    for (int i = 0; i < 4; i++) {
                        if (isLegal(state, cell, i + 1)) {
                            //System.out.println(i+1);
                            temp[size] = i + 1;
                            size++;
                        }
                    }
                    //System.out.println();
                    result[j] = temp;
                    size = 0;
                }
                j++;
                temp = new int[0];
            }
        } else if (state.getCells().size() == 36) {
            for (Cell cell : state.getCells()) {
                if (cell.getValue() == 0) {
                    temp = new int[6];
                    for (int i = 0; i < 6; i++) {
                        if (isLegal(state, cell, i + 1)) {
                            //System.out.println(i+1);
                            temp[size] = i + 1;
                            size++;
                        }
                    }
                    //System.out.println();
                    result[j] = temp;
                    size = 0;
                }
                j++;
                temp = new int[0];
            }
        } else if (state.getCells().size() == 81) {
            for (Cell cell : state.getCells()) {
                if (cell.getValue() == 0) {
                    temp = new int[9];
                    for (int i = 0; i < 9; i++) {
                        if (isLegal(state, cell, i + 1)) {
                            //System.out.println(i+1);
                            temp[size] = i + 1;
                            size++;
                        }
                    }
                    //System.out.println();
                    result[j] = temp;
                    state.getCells().get(j).setPredictAmt(size);
                    state.getCells().get(j).setPredictVals(temp);
                    size = 0;
                }
                j++;
                temp = new int[0];
            }
        }


        return result;
    }

    public List<Integer> posValue(State state) {
        int[][] test = isPredict(state);
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int pos = 0;
        int value = 0;
        int countNum = 0;
        if (state.getCells().size() == 16) {
            for (int k = 0; k < 16; k++) {
                //System.out.println(k);
                for (int l = 0; l < test[k].length; l++) {
                    //if(test[k][l] != 0) System.out.print(" " + test[k][l]);
                    if (test[k][1] == 0 && test[k][0] != 0) {
                        result.add(k);
                        result.add(test[k][l]);
                        break;
                    }
                }
                //System.out.println();
            }
        /*for (int m : result){
            System.out.println(m);
        }*/
        } else if (state.getCells().size() == 36) {
            for (int k = 0; k < 36; k++) {
                //System.out.println(k);
                for (int l = 0; l < test[k].length; l++) {
                    //if(test[k][l] != 0) System.out.print(" " + test[k][l]);
                    if (test[k][1] == 0 && test[k][0] != 0) {
                        result.add(k);
                        result.add(test[k][l]);
                        break;
                    }
                }
                //System.out.println();
            }
        /*for (int m : result){
            System.out.println(m);
        }*/
        } else if (state.getCells().size() == 81) {
            int[] theValues = new int[9];
            for (int k = 0; k < 81; k++) {
                //System.out.println(k);
                for (int l = 0; l < test[k].length; l++) {
                    //if(test[k][l] != 0) System.out.print(" " + test[k][l]);
                    //if (test[k][1] == 0 && test[k][0] != 0) {
                    if (test[k][1] == 0 && test[k][0] != 0) {
                        result.add(k);
                        result.add(test[k][l]);
                        break;
                    }
                    //}
                }
                //System.out.println();
            }
        /*for (int m : result){
            System.out.println(m);
        }*/
        }


        return result;

    }

    /*public int countTheMostDigitsX(State state) {
        int[] digits = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 1; i <= 9; i++) {
            char[] values = state.getValuesInBox(i).toCharArray();
            for (Character digit : values) {
                if (Character.getNumericValue(digit) == 1) digits[0]++;
                if (Character.getNumericValue(digit) == 2) digits[1]++;
                if (Character.getNumericValue(digit) == 3) digits[2]++;
                if (Character.getNumericValue(digit) == 4) digits[3]++;
                if (Character.getNumericValue(digit) == 5) digits[4]++;
                if (Character.getNumericValue(digit) == 6) digits[5]++;
                if (Character.getNumericValue(digit) == 7) digits[6]++;
                if (Character.getNumericValue(digit) == 8) digits[7]++;
                if (Character.getNumericValue(digit) == 9) digits[8]++;
            }
        }
        int max = 0;
        int result = 0;
        for(int j = 0; j < 9; j++){
            if(digits[j] > 0) {
                max = digits[j];
                result = j;
            }
        }
        return result;
    }*/

    public int moreSolutions(Node parent, List<Node> listOfNodes) {
        int cantAdd = 0;
        int found = 0;

        for (Cell cell : parent.getState().getCells()) {
            if (cell.getValue() == 0) {
                if (found == -1)
                    return -1; //breaks the recursive function if solution is found
                for (int i = 1; i <= 9; i++) {
                    if (isLegal(parent.getState(), cell, i)) {
                        List<Cell> newList = State.prevStateCells(parent.getState().getCells());
                        Node childNode = new Node(new State(newList), parent, 0);
                        newList.get(cell.getPos()).setValue(i);
                        listOfNodes.add(childNode);
                        //System.out.println(childNode.getState());
                        if (State.isFull(childNode.getState())) {
                            System.out.println("done");
                            System.out.println(childNode.getState());
                            return 0;
                        }
                        found = moreSolutions(childNode, listOfNodes); //call the function again to see if it has more childNodes
                    } else if (cantAdd == 9) {
                        return -1;
                    } else {
                        cantAdd++;
                    }
                }
            }
        }
        return found;
    }

}
