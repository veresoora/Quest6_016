package com.nadia.pertemuan7.ui.view.viewmodel

import com.nadia.pertemuan7.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RencanaStudyViewModel {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi : StateFlow<RencanaStudi> = _krsState.asStateFlow()
}