package com.javajames.awsimageupload.datastore;

import com.javajames.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("7aee0f60-3983-4b05-acef-0ae6617e67ac"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("f4e0630f-e0ee-4c6e-bc32-b50c5f345c70"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
