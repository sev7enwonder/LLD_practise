import java.util.PriorityQueue;

public class Elevator {
    private int currentFloor;
    Direction direction;
    PriorityQueue<Request> upQueue;
    PriorityQueue<Request> downQueue;


    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
        this.direction = Direction.IDLE;

        this.upQueue = new PriorityQueue<>((a,b) -> a.desiredFloor - b.desiredFloor);
        this.downQueue = new PriorityQueue<>((a,b) -> b.desiredFloor - a.desiredFloor);
    }

    private void sendUpRequest(Request upRequest) {
        if(upRequest.location == Location.OUTSIDE_ELEVATOR){
            upQueue.add(new Request(upRequest.currentFloor,upRequest.currentFloor,Direction.UP,Location.OUTSIDE_ELEVATOR));
            System.out.println("appending request to going to floor " + upRequest.currentFloor);
        }

        upQueue.add(upRequest);
        System.out.println("appending request to going to floor " + upRequest.desiredFloor);
    }

    private void sendDownRequest(Request downRequest) {
        if(downRequest.location == Location.OUTSIDE_ELEVATOR){
            downQueue.add(new Request(downRequest.currentFloor,downRequest.currentFloor,Direction.DOWN,Location.OUTSIDE_ELEVATOR));
        }
        downQueue.add(downRequest);
    }

    private void run() {
        while(!upQueue.isEmpty() || !downQueue.isEmpty()){
            processRequest();
        }
    }

    private void processRequest() {
        if(this.direction == Direction.UP || this.direction == Direction.IDLE ){
            processUpRequest();
            processDownRequest();
        }else{
            processDownRequest();
            processUpRequest();
        }
    }

    private void processUpRequest() {
        while(!upQueue.isEmpty()){
            this.currentFloor = upQueue.poll().desiredFloor;
        }

        if(downQueue.isEmpty()){
            this.direction = Direction.IDLE;
        }else {
            this.direction = Direction.DOWN;
        }
    }

    private void processDownRequest() {
        while(!downQueue.isEmpty()){
            this.currentFloor = downQueue.poll().desiredFloor;
        }

        if(upQueue.isEmpty()){
            this.direction = Direction.IDLE;
        }else{
            this.direction = Direction.UP;
        }
    }



    public static void main(String[] args) {
        Elevator elevator = new Elevator(0);

        Request upRequest1 = new Request(elevator.currentFloor,5,Direction.UP,Location.INSIDE_ELEVATOR);
        Request upRequest2 = new Request(elevator.currentFloor,3,Direction.UP,Location.INSIDE_ELEVATOR);

        Request downRequest1 = new Request(elevator.currentFloor, 1, Direction.DOWN, Location.INSIDE_ELEVATOR);
        Request downRequest2 = new Request(elevator.currentFloor, 2, Direction.DOWN, Location.INSIDE_ELEVATOR);
        Request downRequest3 = new Request(4, 0, Direction.DOWN, Location.OUTSIDE_ELEVATOR);

        elevator.sendUpRequest(upRequest1);

        elevator.sendDownRequest(downRequest1);

        elevator.run();
    }

}
