package kunal_kushwaha_dsa;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
        public static int numberOfSteps(int num) {
            return helper(num, 0);
        }

        public static int helper(int num, int count) {
            if (num == 0) {
                return count;
            }
            if ((num & 1) == 1) {
                num -= 1;
            }
            return helper(num / 2, count + 1);
        }
    }
