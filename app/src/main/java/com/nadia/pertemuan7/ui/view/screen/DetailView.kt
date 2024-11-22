package com.nadia.pertemuan7.ui.view.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nadia.pertemuan7.model.Mahasiswa
import com.nadia.pertemuan7.model.RencanaStudi

@Composable
fun DetailView(dataMHS: Mahasiswa,
               dataKRS: RencanaStudi,
               onBackButtonClicked: () -> Unit
){
    val listDataMHS = listOf(
        Pair("NIM", dataMHS.nim),
        Pair("Nama", dataMHS.nama),
        Pair("Email", dataMHS.email)
    )
    val listDataKRS = listOf(
        Pair("Mata Kuliah", dataKRS.mataKuliah),
        Pair("Kelas", dataKRS.kelas)
    )
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        listDataMHS.forEach { data ->
            DetailMahasiswa(
                judul = data.first,
                isinya = data.second
            )
        }

        listDataKRS.forEach { data ->
            DetailMahasiswa(
                judul = data.first,
                isinya = data.second
            )
        }

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                onBackButtonClicked()
            }
        ) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun DetailMahasiswa(
    judul: String,
    isinya: String
){
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth()
                .padding(top = 2.dp)
        ){
            Text(
                text = judul,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = ":",
                modifier = Modifier.weight(0.2f)
            )
            Text(
                text = isinya,
                modifier = Modifier.weight(2f)
            )
        }
    }
}