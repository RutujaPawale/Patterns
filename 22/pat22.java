class Solution {
    public void pattern22(int n) {
        for (int i = 0; i < 2*n - 1; i++){
            for (int j = 0; j < 2*n - 1; j++){
		int top = i;
		int left = j;
		int right = (2*n - 2) - j;
		int down = (2*n -2) - i;
		System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        sol.pattern22(n);
    }
}
