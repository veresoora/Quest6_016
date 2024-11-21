package com.nadia.pertemuan7.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.nadia.pertemuan7.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow

class MahasiswaViewModel : ViewModel() {
    private val _dataModel = MutableStateFlow(Mahasiswa())
}