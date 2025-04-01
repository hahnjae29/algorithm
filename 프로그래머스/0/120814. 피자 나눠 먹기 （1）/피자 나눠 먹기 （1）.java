class Solution {
    public int solution(int n) {
        int answer = n / 7;
        int balance = n % 7;
        if (balance == 0) return answer;
        else return answer + 1;
    }
}