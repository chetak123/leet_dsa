class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {

			if (map.containsKey(arr1[i])) {
				// int x = map.get(arr1[i]) + 1;
				map.put(arr1[i], map.get(arr1[i]) + 1);
			}

			else {
				map.put(arr1[i], 1);
			}

		}

		for (int i = 0; i < arr2.length; i++) {

			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}

		}

		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}

    
}