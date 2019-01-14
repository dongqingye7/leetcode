class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[]casher= new int[]{0,0,0};
        int i=0;
        if(bills==null){
            return true;
        }
        int pay;
        boolean isten=true;
        for(i=0;i<bills.length;i++){
            pay=bills[i];
            if(pay==5){
                casher[0]++;
                
            }
            if(pay==10){
                if(casher[0]>0){
                    casher[0]--;
                    if(isten){
                        casher[1]++;
                    }else{
                        isten=true;
                    }
                    
                }else{
                    return false;
                }
            }
            if(pay==20){
                if(casher[1]>0){
                    casher[1]--;
                    bills[i]-=10;
                    i--;
                    isten=false;
                }else{
                    if(casher[0]>2){
                        casher[0]-=3;
                        
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}