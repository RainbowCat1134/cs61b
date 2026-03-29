
/*
    可写成
    public class SLList<Generics>{}
    Generics，即泛型，可以解决代码难以扩展的问题
    使用泛型则使链表可以处理所有基本类型，以及引用类型的数据
*/
public class SLList {

    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /* public IntNode first;
    使用private关键词以防止其他class的代码使用本class的成员
    虚拟头节点防止exception */

    private IntNode sentinel;
    /* size缓存了列表的大小，所以不用每次都从头计数
       用了额外的一点空间换来了更快的速度 */
    private int size;


    /*  创建一个带有一个x的新SLList
        相比IntNode，用户不需要知道递归就能实现增删改查，简化了操作流程 */
    public SLList(int x){
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /* 创建空列表 */
    public SLList(){
        sentinel = new IntNode(0, null);
        size = 0;
    }

    /* 在列表开头加入x */
    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    /* 得到列表的第一个元素 */
    public int getFirst(){
        return sentinel.next.item;
    }

    /* 将x添加到列表结尾 */
    public void addLast(int x){
        size++;
        IntNode p = sentinel;

        /* 防止空列表nullpointerexception */
//        if(first == null){
//            p = new IntNode(x, null);
//            return;
//        }

        /* 遍历到最后一个next指针 */
        while (p.next != null){
            p = p.next;
        }

        p.next = new IntNode(x, null);

    }

    /* 返回列表的长度 */
    public int size(){
        return size;
    }

    /* 加入辅助递归函数，隐藏IntNode实现细节 */
//    private int size(IntNode p){
//        if(p.next == null){
//            return 1;
//        }
//        return 1 + size(p.next);
//    }

    public static void main (String[] args){
        SLList L = new SLList();
        L.addLast(10);
        System.out.println(L.getFirst());
    }
}
