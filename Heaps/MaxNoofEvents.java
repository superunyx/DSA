class Solution {
    public int maxEvents(int[][] events) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        int day = 1;
        int i = 0;
        int ans = 0;

        while (i < events.length || !pq.isEmpty()) {

            // Add all events that have started
            while (i < events.length && events[i][0] <= day) {
                pq.add(events[i]);
                i++;
            }

            // Remove events that have already expired
            while (!pq.isEmpty() && pq.peek()[1] < day) {
                pq.poll();
            }

            // Attend the event ending earliest
            if (!pq.isEmpty()) {
                pq.poll();
                ans++;
                day++;
            }
            else {
                // No event available, jump to the next event's start day
                if (i < events.length) {
                    day = events[i][0];
                }
            }
        }

        return ans;
    }
}
