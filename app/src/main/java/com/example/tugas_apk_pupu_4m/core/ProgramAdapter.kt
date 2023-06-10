package com.example.tugas_apk_pupu_4m.core

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tugas_apk_pupu_4m.Program
import com.example.tugas_apk_pupu_4m.databinding.ItemRvProgramBinding

class ProgramAdapter(
    private val listProgram: List<Program>,
) : RecyclerView.Adapter<ProgramAdapter.ProgramHolder>() {

    inner class ProgramHolder(val binding: ItemRvProgramBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(allProgram: Program) {
            Glide.with(binding.root).load(allProgram.image)
//                    .placeholder(R.drawable.)
                .into(binding.imageAllHome)
            binding.tvNameAllHome.text = allProgram.name
            binding.tvDesciptionAllHome.text = allProgram.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgramHolder {
        val binding =
            ItemRvProgramBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProgramHolder(binding)
    }

    override fun onBindViewHolder(holder: ProgramHolder, position: Int) {
        holder.bind(allProgram = listProgram[position])
    }

    override fun getItemCount(): Int {
        return listProgram.size
    }


}