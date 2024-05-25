package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ToDoControllerTest {
    
    @Test
    public void testCreate() {
        ToDoController controller = new ToDoController();
        var todo = new ToDo(1, "t", "d");
        controller.createTodo(2, todo);
        assertEquals(1, controller.count());
        assertEquals(1, controller.todo().size());
    }

}
