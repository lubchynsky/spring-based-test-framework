package com.lubchynsky.api;


import com.lubchynsky.api.client.ReqresApiClient;
import com.lubchynsky.api.dto.reqres.User;
import com.lubchynsky.configuration.test.BaseTest;
import io.restassured.response.ValidatableResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UsersTest extends BaseTest {
    @Autowired
    private ReqresApiClient apiClient;

    @Test
    public void getUsersTest() {
        List<User> users = apiClient.getListOfUsers();
        assertThat("List of users should not be empty", users, hasSize(greaterThan(0)));

        User firstUserFromList = users.get(0);
        User userFromApiCallById = apiClient.getUserWithId(firstUserFromList.getId());
        assertThat("Single user api call should be same", userFromApiCallById, equalTo(firstUserFromList));
    }

    @Test
    public void nonExistingUserTest() {
        int nonExistingUserId = 100;
        ValidatableResponse response = apiClient.getRawUserResponseById(nonExistingUserId);
        response.statusCode(404);
    }
}
