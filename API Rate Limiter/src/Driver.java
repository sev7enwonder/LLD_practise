//https://leetcode.com/discuss/interview-question/object-oriented-design/1583096/API-Rate-limiter-or-LLD-(Common-Atlassian-question)


import java.util.HashMap;

public class Driver {
    private HashMap<String,RateLimiter> clientMap;
    public Driver(){
        this.clientMap = new HashMap<>();
    }

    void checkRequestAllowed(String uid,String time){
        if(!clientMap.containsKey(uid)){
            RateLimiter rateLimiter = new FixedWindowRateLimiter(5,10);
            clientMap.put(uid,rateLimiter);
        }else{
            if(clientMap.get(uid).isRateLimit()){
                System.out.println("allowed");
            }else{
                System.out.println("not allowed");
            }
        }
    }
}
