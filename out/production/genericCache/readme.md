//https://www.infoworld.com/article/2075440/develop-a-generic-caching-service-to-improve-performance.html


better

https://medium.com/@marcellogpassos/creating-a-simple-and-generic-cache-manager-in-java-e62e4204a10e

- Any Java application can access the caching service.
- Objects can be placed in the cache.
- Objects can be extracted from the cache.
- Cached objects can determine for themselves when they expire, thereby allowing maximum flexibility
- A background thread that runs under low priority removes expired cached objects.
- The caching service can be enhanced later through the use of a least-recently used (LRU) or least-frequently used (LFU) purging mechanism.

