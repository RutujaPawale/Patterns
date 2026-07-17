class Solution {
    public void pattern14(int n) {
        for (int i = 0; i < n; i++){
            for (char ch ='A'; ch <= 'A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        sol.pattern14(n);
    }
}
