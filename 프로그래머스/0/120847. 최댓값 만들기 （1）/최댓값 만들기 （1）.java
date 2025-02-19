class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                if (i == j){
                    continue;
                }
                
                if (numbers[i] * numbers[j] > max){
                    max = numbers[i] * numbers[j];
                }
            }
        }
        return max;
        
//         int answer = 1;
//         int max = 0;
//         int index = 0;
//         for (int i = 0; i < numbers.length; i++){
//             if (numbers[i] > max){
//                 max = numbers[i];
//                 index = i;
//             }
//         }
        
//         answer *= max;
//         max = 0;
        
//         for (int i = 0; i < numbers.length; i++){
//             if (i == index){
//                 continue;
//             } else {
//                 if (numbers[i] > max){
//                     max = numbers[i];            
//                 }
//             }
//         }
        
//         answer *= max;
//         return answer;
    }
}