class Solution {
    public void pattern19(int n) {
        int iniS = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println();
            iniS += 2;
        }
	int iniSp = 2*n - 2;
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < iniSp; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
            iniSp -= 2;
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 5;
        sol.pattern19(n);
    }
}
