package com.frenchfriesfamily.whowantstobeamillionaire.view.game.dialogs

import com.frenchfriesfamily.whowantstobeamillionaire.R
import com.frenchfriesfamily.whowantstobeamillionaire.databinding.DialogAudienceBinding
import com.frenchfriesfamily.whowantstobeamillionaire.view.AudioViewModel
import com.frenchfriesfamily.whowantstobeamillionaire.view.base.BaseDialogFragment
import com.frenchfriesfamily.whowantstobeamillionaire.view.game.GameViewModel

class AudienceDialog :
    BaseDialogFragment<DialogAudienceBinding, GameViewModel, AudioViewModel>(R.layout.dialog_audience) {

    override val viewModelClass = GameViewModel::class.java
    override val audioViewModelClass = AudioViewModel::class.java


    override fun onStart() {
        super.onStart()
        onClickOk()
    }

    private fun onClickOk() {
        binding.buttonOk.setOnClickListener {
            audioViewModel.audio.playButtonSound(requireContext())
            dismiss()
        }
    }
}