package leetcode.editor.common.basicDataStruct;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Shadowalker
 */
public class BasicArrayList {

    public static void main(String[] args) {
        int n = 10;
        // 初始化 ArrayList，大小为 10，元素值都为 0
        ArrayList<Integer> nums = new ArrayList<>(Collections.nCopies(n, 0));
        // 输出：false
        System.out.println(nums.isEmpty());
        // 输出：10
        System.out.println(nums.size());

        // 在数组尾部插入一个元素 20
        nums.add(20);
        // 输出：11
        System.out.println(nums.size());

        // 得到数组最后一个元素
        // 输出：20
        System.out.println(nums.get(nums.size() - 1));

        // 删除数组的最后一个元素
        nums.remove(nums.size() - 1);
        // 输出：10
        System.out.println(nums.size());

        // 可以通过索引直接取值或修改
        nums.set(0, 11);
        // 输出：11
        System.out.println(nums.get(0));

        // 在索引 3 处插入一个元素 99
        nums.add(3, 99);

        // 删除索引 2 处的元素
        nums.remove(2);

        // 交换 nums[0] 和 nums[1]
        Collections.swap(nums, 0, 1);

        // 遍历数组
        // 输出：0 11 99 0 0 0 0 0 0 0
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
