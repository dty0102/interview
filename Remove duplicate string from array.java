Solution: use nested loop to check the the frequency of each string, if the count > 1 , it means it has duplicates in the array, so we do not add it into the list
	public static void main(String[] args){
		String[] arr = {"dog","cat","tiger","dog"};;
	    List<String> arrList = new ArrayList<String>();
	    int cnt= 0;
	     for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr.length;j++){
	           if(arr[i].equals(arr[j])){
	             cnt+=1;
	           }                
	        }
	        if(cnt<1){
	          arrList.add(arr[i]);
	        }
	          cnt=0;
	        }
	}
