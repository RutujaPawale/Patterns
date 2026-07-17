class Solution {
    public void pattern18(int n) {
        for (int i = 0; i < n; i++){
            for (char ch = (char)('E' - i); ch <= 'E'; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        sol.pattern18(n);
    }
}
