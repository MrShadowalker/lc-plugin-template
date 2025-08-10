package leetcode.editor.common.basicDataStruct;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Shadowalker
 */
public class BasicQueue {
    public static void main(String[] args) {
        // 初始化一个空的整型队列 q
        Queue<Integer> q = new LinkedList<>();

        // 在队尾添加元素
        q.offer(10);
        q.offer(20);
        q.offer(30);

        // 检查队列是否为空，输出：false
        System.out.println(q.isEmpty());

        // 获取队列的大小，输出：3
        System.out.println(q.size());

        // 获取队列的队头元素
        // 输出：10
        System.out.println(q.peek());

        // 删除队头元素
        q.poll();

        // 输出新的队头元素：20
        System.out.println(q.peek());
    }
}
