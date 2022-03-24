package com.lrp.hpcharacters

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.navigation.NavigationView
import com.lrp.hpcharacters.databinding.FragmentMainBinding


class MainFragment : Fragment(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.setNavigationOnClickListener {
            binding.drawerLayout.open()
        }
        binding.navigationView.setNavigationItemSelectedListener(this)
        binding.toolbar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.change_theme_option -> Toast.makeText(context, "change theme", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(context, "nothing", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.about_item) {
            findNavController().navigate(R.id.about_fragment)
            binding.drawerLayout.closeDrawer(Gravity.LEFT)
        }
        return true;
    }
}