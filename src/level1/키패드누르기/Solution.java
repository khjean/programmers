package level1.키패드누르기;

import java.util.HashMap;
import java.util.Map;

public class Solution {


//    123
//    456
//    789
//    *0#
    public String solution(int[] numbers, String hand) {

        String answer = "";

        int xleftPoint = 3;
        String lastleftnumber = "*";
        int xrightPoint = 3;
        String lastrightnumber = "#";

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                if(numbers[i]==1){
                    xleftPoint = 0;
                }else if(numbers[i] ==4){
                    xleftPoint = 1;
                }else{
                    xleftPoint = 2;
                }
                lastleftnumber = String.valueOf(numbers[i]);
                answer+="L";
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                if(numbers[i]==3){
                    xrightPoint = 0;
                }else if(numbers[i] ==6){
                    xrightPoint = 1;
                }else{
                    xrightPoint = 2;
                }
                lastrightnumber = String.valueOf(numbers[i]);
                answer+="R";
            }else{
                int distanceleft = 0;
                int distanceright = 0;
                if(numbers[i] == 2){
                    if(answer.endsWith("L") && (numbers[i-1] == 2 || numbers[i-1] == 5 || numbers[i-1] == 8 || numbers[i-1] == 0)){
                        distanceleft = Math.abs(0 - xleftPoint);
                        distanceright = Math.abs(0 - xrightPoint) +1;
                    } else if (answer.endsWith("R") && (numbers[i-1] == 2 || numbers[i-1] == 5 || numbers[i-1] == 8 || numbers[i-1] == 0)) {
                        distanceleft = Math.abs(0 - xleftPoint)+1;
                        distanceright = Math.abs(0 - xrightPoint);
                    }else{
                        distanceleft = Math.abs(0 - xleftPoint) +1;
                        distanceright = Math.abs(0 - xrightPoint) +1;
                    }
                    if((lastleftnumber.equals("2") || lastleftnumber.equals("5") || lastleftnumber.equals("8") || lastleftnumber.equals("0"))){
                        distanceleft = Math.abs(0 - xleftPoint);
                    }
                    if((lastrightnumber.equals("2") || lastrightnumber.equals("5") || lastrightnumber.equals("8") || lastrightnumber.equals("0"))){
                        distanceright = Math.abs(0 - xrightPoint);
                    }
                    if(distanceleft == distanceright){
                        if("right".equals(hand)){
                            xrightPoint = 0;
                            lastrightnumber = String.valueOf(numbers[i]);
                            answer+="R";
                        }else{
                            xleftPoint = 0;
                            lastleftnumber = String.valueOf(numbers[i]);
                            answer+="L";
                        }
                    } else if (distanceleft > distanceright) {
                        xrightPoint = 0;
                        lastrightnumber = String.valueOf(numbers[i]);
                        answer+="R";
                    }else{
                        xleftPoint = 0;
                        lastleftnumber = String.valueOf(numbers[i]);
                        answer+="L";
                    }
                } else if (numbers[i] == 5) {
                    if(answer.endsWith("L") && (numbers[i-1] == 2 || numbers[i-1] == 5 || numbers[i-1] == 8 || numbers[i-1] == 0)){
                        distanceleft = Math.abs(1 - xleftPoint);
                        distanceright = Math.abs(1 - xrightPoint) +1;
                    } else if (answer.endsWith("R") && (numbers[i-1] == 2 || numbers[i-1] == 5 || numbers[i-1] == 8 || numbers[i-1] == 0)) {
                        distanceleft = Math.abs(1 - xleftPoint)+1;
                        distanceright = Math.abs(1 - xrightPoint);
                    }else{
                        distanceleft = Math.abs(1 - xleftPoint) +1;
                        distanceright = Math.abs(1 - xrightPoint) +1;
                    }
                    if((lastleftnumber.equals("2") || lastleftnumber.equals("5") || lastleftnumber.equals("8") || lastleftnumber.equals("0"))){
                        distanceleft = Math.abs(1 - xleftPoint);
                    }
                    if((lastrightnumber.equals("2") || lastrightnumber.equals("5") || lastrightnumber.equals("8") || lastrightnumber.equals("0"))){
                        distanceright = Math.abs(1 - xrightPoint);
                    }
                    if(distanceleft == distanceright){
                        if("right".equals(hand)){
                            xrightPoint = 1;
                            lastrightnumber = String.valueOf(numbers[i]);
                            answer+="R";
                        }else{
                            xleftPoint = 1;
                            lastleftnumber = String.valueOf(numbers[i]);
                            answer+="L";
                        }
                    } else if (distanceleft > distanceright) {
                        xrightPoint = 1;
                        lastrightnumber = String.valueOf(numbers[i]);
                        answer+="R";
                    }else{
                        xleftPoint = 1;
                        lastleftnumber = String.valueOf(numbers[i]);
                        answer+="L";
                    }
                } else if (numbers[i] == 8) {
                    if(answer.endsWith("L") && (numbers[i-1] == 2 || numbers[i-1] == 5 || numbers[i-1] == 8 || numbers[i-1] == 0)){
                        distanceleft = Math.abs(2 - xleftPoint);
                        distanceright = Math.abs(2 - xrightPoint) +1;
                    } else if (answer.endsWith("R") && (numbers[i-1] == 2 || numbers[i-1] == 5 || numbers[i-1] == 8 || numbers[i-1] == 0)) {
                        distanceleft = Math.abs(2 - xleftPoint)+1;
                        distanceright = Math.abs(2 - xrightPoint);
                    }else{
                        distanceleft = Math.abs(2 - xleftPoint) +1;
                        distanceright = Math.abs(2 - xrightPoint) +1;
                    }
                    if((lastleftnumber.equals("2") || lastleftnumber.equals("5") || lastleftnumber.equals("8") || lastleftnumber.equals("0"))){
                        distanceleft = Math.abs(2 - xleftPoint);
                    }
                    if((lastrightnumber.equals("2") || lastrightnumber.equals("5") || lastrightnumber.equals("8") || lastrightnumber.equals("0"))){
                        distanceright = Math.abs(2 - xrightPoint);
                    }
                    if(distanceleft == distanceright){
                        if("right".equals(hand)){
                            xrightPoint = 2;
                            lastrightnumber = String.valueOf(numbers[i]);
                            answer+="R";
                        }else{
                            xleftPoint = 2;
                            lastleftnumber = String.valueOf(numbers[i]);
                            answer+="L";
                        }
                    } else if (distanceleft > distanceright) {
                        xrightPoint = 2;
                        lastrightnumber = String.valueOf(numbers[i]);
                        answer+="R";
                    }else{
                        xleftPoint = 2;
                        lastleftnumber = String.valueOf(numbers[i]);
                        answer+="L";
                    }
                }else {
                    if(answer.endsWith("L") && (numbers[i-1] == 2 || numbers[i-1] == 5 || numbers[i-1] == 8 || numbers[i-1] == 0)){
                        distanceleft = Math.abs(3 - xleftPoint);
                        distanceright = Math.abs(3 - xrightPoint) +1;
                    } else if (answer.endsWith("R") && (numbers[i-1] == 2 || numbers[i-1] == 5 || numbers[i-1] == 8 || numbers[i-1] == 0)) {
                        distanceleft = Math.abs(3 - xleftPoint)+1;
                        distanceright = Math.abs(3 - xrightPoint);
                    }else{
                        distanceleft = Math.abs(3 - xleftPoint) +1;
                        distanceright = Math.abs(3 - xrightPoint) +1;
                    }
                    if((lastleftnumber.equals("2") || lastleftnumber.equals("5") || lastleftnumber.equals("8") || lastleftnumber.equals("0"))){
                        distanceleft = Math.abs(3 - xleftPoint);
                    }
                    if((lastrightnumber.equals("2") || lastrightnumber.equals("5") || lastrightnumber.equals("8") || lastrightnumber.equals("0"))){
                        distanceright = Math.abs(3 - xrightPoint);
                    }

                    if(distanceleft == distanceright){
                        if("right".equals(hand)){
                            xrightPoint = 3;
                            lastrightnumber = String.valueOf(numbers[i]);
                            answer+="R";
                        }else{
                            xleftPoint = 3;
                            lastleftnumber = String.valueOf(numbers[i]);
                            answer+="L";
                        }
                    } else if (distanceleft > distanceright) {
                        xrightPoint = 3;
                        lastrightnumber = String.valueOf(numbers[i]);
                        answer+="R";
                    }else{
                        xleftPoint = 3;
                        lastleftnumber = String.valueOf(numbers[i]);
                        answer+="L";
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String answer = solution.solution(numbers,hand);
        System.out.println(answer);

    }
}
