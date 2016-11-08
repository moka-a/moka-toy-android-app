package com.moka.mokatoyapp._di.component

import com.moka.mokatoyapp._di.PerFragment
import com.moka.mokatoyapp._di.module.FragmentModule
import com.moka.mokatoyapp.vp.TaskListFragment
import dagger.Component

@Component(
        dependencies = arrayOf(ApplicationComponent::class),
        modules = arrayOf(FragmentModule::class)
)
@PerFragment
interface FragmentComponent {

    fun inject(taskListFragment: TaskListFragment)

}