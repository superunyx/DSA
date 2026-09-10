// Sort normal array
Arrays.sort(arr);

// Sort 2D array by first value
Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//or
Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

// HashMap
map.getOrDefault(x, 0);

// Keep only part of an array
Arrays.copyOf(arr, size);


List<int[]> list = new ArrayList<>();

int[][] ans = list.toArray(new int[0][]);

//adding and array to a list of arrays
res.add(new int[]{start,end});
