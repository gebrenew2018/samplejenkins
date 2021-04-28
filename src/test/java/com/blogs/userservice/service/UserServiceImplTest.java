package com.blogs.userservice.service;

import com.blogs.userservice.model.User;
import com.blogs.userservice.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static reactor.core.publisher.Mono.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    @Mock
    private UserRepository repository;

    @Autowired
    private UserService userService;

    @Test
    public void saveUser() {
        User user = new User(1, "gebre", "haile", "gebre", "123");
        UserRepository mocked = mock(UserRepository.class);
        Mockito.when(mocked.save(user)).thenReturn(user);
        assertEquals(result.getUserName(), user.getUserName());

    }
}