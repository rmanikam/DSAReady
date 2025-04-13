package Arrays;

import java.util.ArrayList;

class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        
        
int m = matrix.length;
if(m==0){
    ArrayList<Integer> output = new ArrayList<Integer>(0);
	return output;
}
int n = matrix[0].length;
int rs = 0;
int re = m ;   
int cs = 0;

int ce = n;    
int count = 0;
int t = 0;
int total=n*m;   

ArrayList<Integer> output = new ArrayList<Integer>(n*m);

while(count < total)
{
	t = cs;
	while(t < ce && count < total)
	{
      output.add(matrix[rs][t]);
	 count++;
	 t++;

	}
	rs++;
	t = rs;
	while(t < re &&count < total)
	{
		output.add(matrix[t][ce-1]);
		count++;
		t++;

	}
	ce--;
	t = ce-1;
	while(t >= cs&&count < total)
	{
		output.add(matrix[re-1][t]);
		count++;
		t--;
	}
	re--;
	t = re-1;
	while (t >= rs&&count < total) {
		output.add(matrix[t][cs]);
		count++;
		t--;
	}
	cs++;

  }
  return output;
        
 }
    
}
