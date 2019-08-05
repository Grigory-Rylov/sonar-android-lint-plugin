package org.sonar.plugins.android.lint;

import junit.framework.Assert;
import org.junit.Test;

public class ProfileRepositoryTest {
    private ProfileRepository profileRepository = new ProfileRepository();

    @Test
    public void returnDefaultValueWhenHasNoEnv() throws Exception {
        Assert.assertEquals("org/sonar/plugins/android/lint/profile-android-lint.xml",
                profileRepository.getLintProfilePath());
    }
}
