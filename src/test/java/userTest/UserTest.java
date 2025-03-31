package userTest;

import org.junit.jupiter.api.Test;
import user.User;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void testCreateUser(){
        User user = new User ("Wille", "password123");
    }

    @Test
    public void testGetUserName(){
        User user = new User ("Wille", "password123");
        String expected = "Wille";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPassWord(){
        User user = new User ("Wille", "password123");
        String expected = "password123";
        String actual = user.getPassWord();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName(){
        User user = new User ("Wille", "password123");
        String expected = "Henry";
        user.setUserName("Henry");
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassWord(){
        User user = new User ("Wille", "password123");
        String expected = "password!";
        user.setPassWord("password!");
        String actual = user.getPassWord();
        assertEquals(expected, actual);
    }

}
