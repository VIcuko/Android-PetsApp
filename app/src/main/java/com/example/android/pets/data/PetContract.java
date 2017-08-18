package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Vicuko on 18/8/17.
 */

public final class PetContract {

    public static abstract class PetsEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";
        public static final String COLUMN_NAME = "_id";
        public static final String COLUMN_BREED = "breed";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_WEIGHT = "weight";

        /*
        Possible values for the gender of the pet
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
