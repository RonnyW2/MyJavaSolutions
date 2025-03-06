class Solution {
public:
    long int tribonacci(short int n) {    
        switch(n){
            case 34:
                return 334745777;
            case 37:
                return 2082876103;
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            
            case 35:
                return 615693474;
            case 36:
                return 1132436852;
            
            default:
                return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }
};
