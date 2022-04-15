<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar2"
        android:layout_width="match_parent"
        android:layout_height="57dp"
        android:background="?attr/colorPrimary"
        android:minHeight="?attr/actionBarSize"
        android:theme="?attr/actionBarTheme"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteY="1dp" />

    <Board1
        android:id="@+id/Board1"
        android:layout_width="150dp"
        android:layout_height="200dp"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteX="27dp"
        tools:layout_editor_absoluteY="94dp"
        tools:srcCompat="@tools:sample/avatars" />

    <Board2
        android:id="@+id/Board2"
        android:layout_width="150dp"
        android:layout_height="200dp"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteX="234dp"
        tools:layout_editor_absoluteY="94dp"
        tools:srcCompat="@tools:sample/avatars" />

    <Board3
        android:id="@+id/Board3"
        android:layout_width="150dp"
        android:layout_height="200dp"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteX="27dp"
        tools:layout_editor_absoluteY="334dp"
        tools:srcCompat="@tools:sample/avatars" />

    <Board4
        android:id="@+id/Board4"
        android:layout_width="150dp"
        android:layout_height="200dp"
        tools:ignore="MissingConstraints"
        tools:layout_editor_absoluteX="234dp"
        tools:layout_editor_absoluteY="334dp"
        tools:srcCompat="@tools:sample/avatars" />

    <androidx.constraintlayout.widget.Guideline
        android:id="@+id/guideline"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        app:layout_constraintGuide_begin="20dp" />

    <androidx.constraintlayout.widget.Guideline
        android:id="@+id/guideline2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:layout_constraintGuide_begin="384dp" />

</androidx.constraintlayout.widget.ConstraintLayout>