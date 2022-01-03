import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public class FixedWindowRateLimiter extends RateLimiter{

    public FixedWindowRateLimiter(int requests, int time) {
        super(requests, time);
    }

    ConcurrentMap<Long, AtomicInteger> window = new ConcurrentHashMap<>();

    @Override
    public boolean isRateLimit() {
        long wkey = System.currentTimeMillis()/1000;
        window.putIfAbsent(wkey,new AtomicInteger(0));

        return window.get(wkey).incrementAndGet() <= requestsAllowed/timeAllowed;
    }
}
