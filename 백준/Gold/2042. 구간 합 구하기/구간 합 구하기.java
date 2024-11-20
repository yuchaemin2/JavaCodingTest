import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static long[] tree; // 세그먼트 트리
    static long[] arr;  // 입력 배열
    static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new long[N + 1];
        tree = new long[N * 4]; // 세그먼트 트리 배열 크기

        // 입력값 초기화
        for (int i = 1; i <= N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        // 세그먼트 트리 초기화
        init(1, N, 1);

        StringBuilder sb = new StringBuilder();
        int count = M + K; // 명령의 총 횟수

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if (a == 1) {
                // b번째 수를 c로 변경
                long diff = c - arr[b];
                arr[b] = c;
                update(1, N, 1, b, diff);
            } else if (a == 2) {
                // b번째 수부터 c번째 수까지의 합 출력
                sb.append(query(1, N, 1, b, (int) c)).append("\n");
            }
        }

        // 결과 출력
        System.out.print(sb);
    }

    // 세그먼트 트리 초기화
    static long init(int start, int end, int node) {
        if (start == end) {
            return tree[node] = arr[start];
        }
        int mid = (start + end) / 2;
        return tree[node] = init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1);
    }

    // 특정 범위의 합을 구하는 메서드
    static long query(int start, int end, int node, int left, int right) {
        if (right < start || end < left) {
            return 0; // 범위를 벗어난 경우
        }
        if (left <= start && end <= right) {
            return tree[node]; // 범위 안에 완전히 포함된 경우
        }
        int mid = (start + end) / 2;
        return query(start, mid, node * 2, left, right) + query(mid + 1, end, node * 2 + 1, left, right);
    }

    // 특정 인덱스의 값을 갱신하는 메서드
    static void update(int start, int end, int node, int index, long diff) {
        if (index < start || index > end) {
            return; // 범위를 벗어난 경우
        }
        tree[node] += diff; // 변경값 반영
        if (start != end) { // 리프 노드가 아닌 경우
            int mid = (start + end) / 2;
            update(start, mid, node * 2, index, diff);
            update(mid + 1, end, node * 2 + 1, index, diff);
        }
    }
}
