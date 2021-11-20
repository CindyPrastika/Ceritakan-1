package com.example.perempuan.ui.tips

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.perempuan.databinding.FragmentTipsBinding

class TipsFragment : Fragment() {

    private lateinit var tipsViewModel: TipsViewModel
    private var _binding: FragmentTipsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tipsViewModel =
            ViewModelProvider(this).get(TipsViewModel::class.java)

        _binding = FragmentTipsBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textTips
//        tipsViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}