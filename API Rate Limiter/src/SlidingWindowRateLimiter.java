public class SlidingWindowRateLimiter extends RateLimiter{

    public SlidingWindowRateLimiter(int requests, int time) {
        super(requests, time);
    }

    @Override
    public boolean isRateLimit() {
        return false;
    }
}
