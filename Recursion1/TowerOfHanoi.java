

class TowerOfHanoi{


    // only one disk at a time,


//    a c
//    a b
//    c b
//    a c
//    b a
//    b c
//    a c
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Write your code here
        if(disks==1){
            System.out.println(source+" "+ destination);
            return;
        }
        disks=disks-1;
        towerOfHanoi(disks,source,destination,auxiliary);
        System.out.println(source+" "+ destination);
        towerOfHanoi(disks,auxiliary,source,destination);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'a', 'b', 'c');

    }
}