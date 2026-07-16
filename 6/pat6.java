class Solution {
	public void pattern6(int n) {
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= n - i + 1; j++){
				System.out.print(j);
			}
		System.out.println();
		} 
		
	}
	public static void main(String[] args){
		Solution sol = new Solution();
		int n = 5;
		sol.pattern6(n);
	}
}
