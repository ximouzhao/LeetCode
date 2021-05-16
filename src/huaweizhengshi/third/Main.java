package huaweizhengshi.third;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num=scanner.nextInt();
            Map<Integer,Node> map=new HashMap<>();
            int[][] array=new int[num][2];
            Node rootNode=new Node(0);
            map.put(0,rootNode);
            for(int i=0;i<num;i++){
                int child=scanner.nextInt();
                int parent=scanner.nextInt();
                array[i][0]=child;
                array[i][1]=parent;
                // 保存值和对应节点的关系映射
                if(!map.containsKey(child)){
                    map.put(child,new Node(child));
                }
                if(!map.containsKey(parent)){
                    map.put(parent,new Node(parent));
                }
            }
            for(int i=0;i<num;i++){
                Node parentNode=map.get(array[i][1]);
                Node childrenNode=map.get(array[i][0]);
                // 在父节点添加孩子节点
                parentNode.getChildren().add(childrenNode);
                // 在子节点设置父亲
                childrenNode.setParent(parentNode);
            }
            int toDeleteNum=scanner.nextInt();
            Node toDeleteNode=map.get(toDeleteNum);
            toDeleteNode.getParent().getChildren().remove(toDeleteNode);
            List<Integer> list=new ArrayList<>();
            getAllNodes(rootNode,list);
            list.sort(Integer::compareTo);
            int i=0;
            for(;i<list.size()-1;i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.print(list.get(i));
        }
    }
    public static void getAllNodes(Node root,List<Integer> values){
        if(root.getValue()!=0){
            values.add(root.getValue());
        }
        for(Node node:root.getChildren()){
            getAllNodes(node,values);
        }
    }
}
class Node implements Comparable<Node>{
    Node(Integer value){
        this.value=value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    private Integer value;

    public Set<Node> getChildren() {
        return children;
    }

    private final Set<Node> children =new TreeSet<>();

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
    // 对本题来说parent可要可不要
    private Node parent;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public int compareTo(Node node) {
        return this.getValue().compareTo(node.getValue());
    }
}