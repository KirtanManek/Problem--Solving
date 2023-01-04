class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        // Adding first column in pascal's triangle
        ans.add(new ArrayList<Integer>());
        ans.get(0).add(0, 1);

        // Adding second column in pascal's triangle
        ans.add(new ArrayList<Integer>());
        ans.get(1).add(0, 1);
        ans.get(1).add(1, 1);

        for(int i = 2; i < rowIndex + 1; i++){
            ans.add(new ArrayList<Integer>());
            ans.get(i).add(0, 1);

            for(int j = 0; j + 1 < ans.get(i - 1).size(); j++) {
                ans.get(i).add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j + 1));
            }

            ans.get(i).add(1);
        }

        return ans.get(rowIndex);
    }
}
