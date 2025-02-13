package day11_0213.Tree;
//1. Node 생성 => Root
//2. BST에 데이터 넣은 기능 구현
public class NodeMgmt {
    Node head = null;

    public class Node {
        Node left;
        Node right;
        int value;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        //CASE1 : Node가 하나도 없을때
        if (this.head == null) {
            this.head = new Node(data);
        } else { //CASE2 : Node가 하나 이상 들어가 있을때
            Node findNode = this.head;
            while (true) {
                //CASE2-1 :  현재 Node의 왼쪽에 노드가 들어가야 할때
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }

                    //CASE2-2 :  현재 Node의 오른쪽에 Node가 들어가야 할때

                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }

                }

            }

        }


        return true;
    }

    public Node search(int data) {
        //CASE 1 : Node가 하나도 없을때
        if (this.head == null) {
            return null;
            //CASE 2 : Node가 하나 이상일때
        } else {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }


            }


        }


        return null;
    }


    public boolean delete(int value) {
        if (this.head == null) {
            return false; // 빈 트리면 삭제할 게 없음
        }

        Node parent = head;
        Node current = head;
        boolean isLeftChild = false;

        // 1) 삭제할 노드를 찾기
        while (current.value != value) {
            parent = current;
            if (value < current.value) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
            if (current == null) {
                return false; // 트리에 해당 값이 없음
            }
        }

        // 2) case 1: 리프 노드일 경우
        if (current.left == null && current.right == null) {
            if (current == head) {
                head = null;
            } else {
                if (isLeftChild) parent.left = null;
                else parent.right = null;
            }
        }
        // 3) case 2: 자식이 하나인 경우
        else if (current.right == null) {
            // 오른쪽 자식 없음, 즉 왼쪽 자식만 있음
            if (current == head) {
                head = current.left;
            } else {
                if (isLeftChild) parent.left = current.left;
                else parent.right = current.left;
            }
        } else if (current.left == null) {
            // 왼쪽 자식 없음, 즉 오른쪽 자식만 있음
            if (current == head) {
                head = current.right;
            } else {
                if (isLeftChild) parent.left = current.right;
                else parent.right = current.right;
            }
        }
        // 4) case 3: 자식이 둘 다 있는 경우
        else {
            // 오른쪽 서브트리에서 가장 작은 노드를 찾는다(successor)
            Node successorParent = current;
            Node successor = current.right;
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }
            // successor가 current를 대체할 노드

            current.value = successor.value; // 값을 바꿔치기

            // 그리고 successor 노드는 원래 current 노드 위치에 들어왔으니,
            // 이제 successor의 부모와 successor의 자식을 연결
            if (successor.right != null) {
                // 만약 successor가 오른쪽 자식을 갖고 있으면 그 쪽으로 연결
                if (successorParent.left == successor) {
                    successorParent.left = successor.right;
                } else {
                    successorParent.right = successor.right;
                }
            } else {
                // successor가 리프였다면 그냥 부모 포인터 null 처리
                if (successorParent.left == successor) {
                    successorParent.left = null;
                } else {
                    successorParent.right = null;
                }
            }
        }

        return true;
    }

    public void delete1(int data) {
        if (this.head == null) {
            System.out.println("트리 비어 있음!!");
        }
        Node findNode = this.head;
        while (findNode != null) {
            if (findNode.value == data) {
                //return findNode;
                findNode = findNode.left;


            } else if (data < findNode.value) {
                findNode = findNode.left;
            } else {
                findNode = findNode.right;
            }

        }


    }
}









