class Solution {
    public int solution(int n, int k) {
        int answer = n * 12000 + k * 2000 - ((n / 10) * 2000); //수정이 필요함
        return answer;
    }
}