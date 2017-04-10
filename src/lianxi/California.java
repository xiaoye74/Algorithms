package lianxi;

import java.util.Arrays;
import java.util.Comparator;

public class California {
	public static final Comparator<String> CANDIDATE_ORDER = new CandidateComparator();

    private static class CandidateComparator implements Comparator<String> {
        private static String order = "RWQOJMVAHBSGZXNTCIEKUPDYFL";
        public int compare(String a, String b) {
            int n = Math.min(a.length(), b.length());
            for (int i = 0; i < n; i++) {
                int aindex = order.indexOf(a.charAt(i));
                int bindex = order.indexOf(b.charAt(i));
                if      (aindex < bindex) return -1;
                else if (aindex > bindex) return +1;
            }
            return a.length() - b.length();
        }
    }



    // test client
    public static void main(String[] args) {
        String[] candidates = new String[5];
        candidates[0]="akbw";
        candidates[1]="akbwq";
        candidates[2]="wxzdvwsss";
        candidates[3]="cfdcv";
        candidates[4]="gyhjf";
        System.out.println(CANDIDATE_ORDER.compare(candidates[2],candidates[1]));
        int n = candidates.length;
        Arrays.sort(candidates, California.CANDIDATE_ORDER);
        for (int i = 0; i < n; i++)
            System.out.println(candidates[i]);
    }





}
