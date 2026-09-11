class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int[] ans = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {

            if (!operations[i].equals("+") && 
                !operations[i].equals("D") && 
                !operations[i].equals("C")) {

                ans[index++] = Integer.parseInt(operations[i]);

            } else if (operations[i].equals("+")) {

                ans[index] = ans[index - 1] + ans[index - 2];
                index++;

            } else if (operations[i].equals("D")) {

                ans[index] = 2 * ans[index - 1];
                index++;

            } else if (operations[i].equals("C")) {

                index--; // remove previous valid score
            }
        }

        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += ans[i];
        }

        return sum;
    }
}