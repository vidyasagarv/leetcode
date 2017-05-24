public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        if(numRows < 1){
            return pascalTriangle;
        }
        List<Integer> previousRow = new ArrayList<>();
        previousRow.add(1);
        pascalTriangle.add(previousRow);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);// beginning
            for(int j = 0; j < previousRow.size()-1; j++){
                currentRow.add(previousRow.get(j)+previousRow.get(j+1));
            }
            currentRow.add(1);// ending
            pascalTriangle.add(currentRow);
            previousRow = currentRow;
        }
        return pascalTriangle;
    }
}