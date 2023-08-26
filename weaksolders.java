import java.util.*;
public class weaksolders {
    static class row implements Comparable <row> {
        int solders;
        int idx;
        public row (int solder,int idx) {
            this.solders = solders;
            this.idx=idx;
        }
        public int compareTo(row r2) {
            if (this.solders==r2.solders) {
                return this.idx-r2.idx;
            }else {
                return this.solders-r2.solders;
            }
        }

    }
    public static void main (String args[]) {
        int army [][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};
        int k=2;    
        PriorityQueue<row> pq = new PriorityQueue<>();
        for (int i=0;i<army.length;i++) {
            int count =0;
            for(int j=0;j<army[0].length;j++) {
                count += army[i][j]==1 ? 1:0;
            }
            pq.add(new row(count,i));

        }       
        for (int i=0;i<k && !pq.isEmpty();i++) {
            System.out.println("Row "+pq.remove().idx);
        }   
    }
}
