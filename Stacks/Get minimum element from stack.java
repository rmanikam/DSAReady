package Stacks;

import java.util.Stack;

class GfG
{
    int minEle;
    Stack<Integer> s;
    
    // Constructor    
    GfG()
	{
      s = new Stack<>();
      minEle = Integer.MAX_VALUE;
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	  if (s.empty()) {
            return -1; // If stack is empty, there's no minimum element
        }
	  return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	 if(s.empty())
        {
           return -1;
        }
        int topValue = s.pop();
        if(topValue < minEle)
        {
            int originalMin = minEle;
            minEle = 2 * minEle - topValue;
            return originalMin;
        }
        return topValue;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	
	 if(s.empty())
        {
           minEle = x;
           s.push(x);
        }
        else
        {
            if(x >= minEle)
            {
                s.push(x);

            }
            else
            {
                s.push(2*x - minEle);
                minEle = x;
            }
        }
    }
    
}

