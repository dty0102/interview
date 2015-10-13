public int singleNumberII(int[] A) {
        // write your code here
        if (A == null) return -1;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int result = 0;
        for (int i = 0; i < A.length; i++){
            if (!map.containsKey(A[i])){
                map.put(A[i],1);
            }
            else map.put(A[i], map.get(A[i]) + 1);
        }
        for (Integer key : map.keySet()){
            if (map.get(key) == 1 ){result = key; break;}
        }
        return result;
    }
    
  public int singleNumber(int[] A) {
		if (A.length == 0) {
			return 0;
		}

		int n = A[0];
		for(int i = 1; i < A.length; i++) {
			n = n ^ A[i];
		}

		return n;
	}
